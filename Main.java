public class Main {
    public static final int ALL = 0;
    public static final int POSITIVE = 1;
    public static final int NEGATIVE = 2;

    public static void main(String[] args) {
        int[][] data = {
            {20, -4, 8, 12},
            {-81, 6, 77},
            {-20, 1, 5, 36, -5, 18, 55}
        };
        String[] name = {"全ての平均", "正数の平均", "負数の平均"};
        int[] sum = new int[name.length];
        int[] count = new int[name.length];

        System.out.println("次のデータの平均を計算します");
        for(int i = 0; i < data.length; i++) {
            int[] array = data[i];

            for(int j = 0; j < array.length; j++) {
                int n = array[j];
                System.out.print(n);

                if(j + 1 < array.length) {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int[] array : data) {
            for(int n : array) {
                sum[ALL] += n;
                count[ALL]++;

                if(n < 0) {
                    sum[NEGATIVE] += n;
                    count[NEGATIVE]++;
                }
                else {
                    sum[POSITIVE] += n;
                    count[POSITIVE]++;
                }
            }
        }

        for(int i = 0; i < name.length; i++) {
            double average = (double)sum[i] / count[i];
            System.out.println("%s: %.2f".formatted(name[i], average));
        }
    }

}