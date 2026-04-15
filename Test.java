package test;

import model.CounterModel; //Xử lý số
import view.CounterView; // Xử lý giao diện

public class Test {
public static void main(String[] args) {
	CounterModel ct = new CounterModel(); //Tạo object ct
	ct.increment();
	ct.increment();
	ct.increment();
    System.out.println(ct.getValue());
    ct.decrement();
    System.out.println(ct.getValue());
    
    CounterView ctv = new CounterView();
    //Tạo giao diện
    /*➡️ Khi chạy dòng này:
      Cửa sổ hiện ra
      Có nút UP / DOWN
      Có số hiển th*/
}
}
