/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

import java.util.Stack;

/**
 *
 * @author D E L L
 */
public class Asteroid_Collision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        boolean asteroidsAlive = true;
        for (int asteroid : asteroids) {
            asteroidsAlive = true;
            if (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                while (!stack.isEmpty() && stack.peek() > 0 && asteroidsAlive) {
                    if (Math.abs(asteroid) > Math.abs(stack.peek())) {
                        stack.pop();
                    } else if (Math.abs(asteroid) == Math.abs(stack.peek())) {
                        asteroidsAlive = false;
                        stack.pop();
                    } else {
                        asteroidsAlive = false;
                        break;
                    }
                }
                if(asteroidsAlive){
                    stack.push(asteroid);
                }
            } else {
                stack.push(asteroid);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
