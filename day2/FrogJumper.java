import java.util.*;

public class FrogJumper {

    public static boolean canCross(int[] stones) {

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for (int stone : stones) {
            map.put(stone, new HashSet<>());
        }

        map.get(0).add(0);

        for (int stone : stones) {

            for (int jump : map.get(stone)) {

                for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {

                    if (nextJump > 0) {

                        int reach = stone + nextJump;

                        if (reach == stones[stones.length - 1])
                            return true;

                        if (map.containsKey(reach)) {
                            map.get(reach).add(nextJump);
                        }
                    }
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {

        int stones[] = {0,1,3,5,6,8,12,17};

        System.out.println(canCross(stones));
    }
}