package basics;

import java.util.HashSet;
import java.util.Set;

/*
 * You are controlling a Mars rover, and you need to make it reach its destination. The rover can move either forward or backward in steps of a given size. However, there are some stones on Mars, and the rover cannot move over them.
 *  You need to calculate the minimum number of moves required for the rover to reach
 *   its destination while avoiding the stones in its path.
	
	Write a function minMoves that takes the following parameters:
	destination (integer): The destination position on Mars where the rover needs to reach.
	step (integer): The step size by which the rover can move forward or backward in each step.
	stones (array of integers): An array containing the positions of the stones on Mars.
	The function should return an integer representing the minimum number of moves required for the rover to reach its destination. 
	If it is not possible to reach the destination due to stones blocking both forward and backward directions, 
	return -1.
 */
public class MarsRover {

	public static int minMoves(int destination, int step, int[] stones) {
		Set<Integer> stoneSet = new HashSet<>();
		for (int stone : stones) {
			stoneSet.add(stone);
		}

		int position = 0;
		int moves = 0;

		while (position != destination) {
			if (!stoneSet.contains(position + step)) {
				position += step;
			} else if (!stoneSet.contains(position - step)) {
				position -= step;
			} else {
				return -1; // Cannot move forward or backward due to stones blocking both directions
			}
			moves++;
		}

		return moves;
	}

	public static void main(String[] args) {
		int destination = 12;
		int step = 3;
		int[] stones = { 3, 5, 7, 9 };
		int minMoves = minMoves(destination, step, stones);
		System.out.println("Minimum moves required: " + minMoves);
	}
}