import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // やり直す問題の番号を格納するList
        List<Integer> list = new ArrayList<>();

        int q = sc.nextInt();

        // 2回目までの結果を受け取る
        for(int i = 1; i <= q; i++){
            String one = sc.next();
            String two = sc.next();

            // 間違えていたら番号をListに格納
            boolean isYesOrNo = one.equals("n") || two.equals("n");
            if(isYesOrNo){
                list.add(i);
            }
        }

        // 間違えていた問題数と問題の番号を出力
        System.out.println(list.size());
        for(Integer num : list){
            System.out.println(num);
        }
    }

}
