public class SurviveTheAttack {

    public static void main(String[] args) {
        int[] attackers = {101};
        int[] defenders = {100};
        System.out.println(block(attackers, defenders));
    }

    public static boolean block(int[] attackers, int[] defenders) {
        int noa = 0;
        int nod = 0;
        if (attackers.length > defenders.length) {
            noa = attackers.length - defenders.length;
            for (int i = 0; i < defenders.length; i++) {
                if (attackers[i] > defenders[i]) {
                    noa++;
                }
                if (attackers[i] < defenders[i]) {
                    nod++;
                }
            }
        }else if (attackers.length < defenders.length) {
            nod = defenders.length - attackers.length;
            for (int i = 0; i < attackers.length; i++) {
                if (attackers[i] > defenders[i]) {
                    noa++;
                }
                if (attackers[i] < defenders[i]) {
                    nod++;
                }
            }
        }else {
            for (int i = 0; i < attackers.length; i++) {
                if (attackers[i] > defenders[i]) {
                    noa++;
                }
                if (attackers[i] < defenders[i]) {
                    nod++;
                }
            }
        }
        if (noa == nod) {
            int aoa = 0;
            int aod = 0;
            for (int i = 0; i < attackers.length; i++) {
                aoa += attackers[i];
            }
            for (int i = 0; i < defenders.length; i++) {
                aod += defenders[i];
            }
            return aod >= aoa;
        }else {
            return nod > noa;
        }
    }
}
