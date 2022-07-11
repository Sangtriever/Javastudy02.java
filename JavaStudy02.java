// 제로베이스 과제 02
// 결제 금액 캐시백 계산 프로그램
// 작성자 : 이상현
import java.util.Scanner;

public class 과제2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cashback;
        System.out.println( "[캐시백 계산]" ) ;
        System.out.print("결제 금액을 입력해 주세요. (금액) : ");
        int amount = in.nextInt();
        cashback = amount/10;
        if(cashback >= 300 ) {
            cashback = 300;
        }else if (cashback >=200 && cashback < 300) {
            cashback = 200;
        }else if (cashback >=100 && cashback < 200){
            cashback = 100;
        }else{
            cashback = 0;
        }
        System.out.println(String.format("결제 금액은 %d원 이고, 캐시백은 %d원 입니다.", amount,cashback));
    }
}
