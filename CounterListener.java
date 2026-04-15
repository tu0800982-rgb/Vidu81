package controller;

//Import = lấy(sử dụng) class có sẵn từ nơi khác
import java.awt.event.ActionEvent; // Để nghe click
import java.awt.event.ActionListener; // Chứa thông tin khi click

import view.CounterView; // Gọi lại class View

public class CounterListener implements ActionListener { 
//Tạo một class tên CounterListener, dùng để nghe và xử lý sự kiện click (như bấm nút)
	
    private CounterView ctv;
    
    public CounterListener(CounterView ctv) { //Constructor
    	this.ctv = ctv;
    }
	@Override
	public void actionPerformed(ActionEvent e) { //Hàm này sẽ chạy khi : user click chuột
 //     System.out.println("Bạn đã nhấn nút !");
           
		String src = e.getActionCommand();
        System.out.println("Bạn đã nhấn nút "+ src);
        
        //Nếu bấm UP: Gọi view -> Tăng số
        if(src.equals("UP")) {
        	this.ctv.increment();
        }
        //Nếu bấm DOWN: Gọi View -> Giảm số
        else if(src.equals("DOWN")) {
        	this.ctv.decrement();
        }
	}
}
/*
🔥 Flow chạy full (cực quan trọng)

👉 Khi m bấm nút UP:

1.JButton nhận click
2.Gọi:
actionPerformed(e)

3.e.getActionCommand() = "UP"

4.Controller chạy:
ctv.increment();

5.View:
gọi Model tăng
update label
*/
