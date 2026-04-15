package view;
//View → hiển thị (nút + số)

import java.awt.BorderLayout;  //cách sắp xếp giao diện (trái, phải, giữa,...)
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel; // Hiển thị chữ
import javax.swing.JPanel; //Khung chứa

import controller.CounterListener; // Xử lý sự kiện
import model.CounterModel; // Dữ liệu (Model)

public class CounterView extends JFrame {
	private CounterModel counterModel; //Dữ liệu ( số đếm )
	private JButton jButton_up; // Nút tăng
	private JButton jButton_down; // Nút giảm
	private JLabel jLabel_Value; // Hiển thị số

	public CounterView() { //Constructor
		this.counterModel = new CounterModel();
		this.init(); // Gọi hàm init() để tạo giao diện
		this.setVisible(true);
	}

	public void init() { // Hàm init(khởi tạo) UI(giao diện người dùng) 
		this.setTitle("Counter"); //Đặt tiêu đề cửa sổ 

		this.setSize(300, 300);
		this.setLocationRelativeTo(null); // Hiển thị ở chính giữa màn hình 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Bấm X thoát chương trình 

		ActionListener ac = new CounterListener(this);
		//Tạo listener(Controller) truyền this(view) vào => Controller sẽ điều khiển view

		jButton_up = new JButton("UP"); // Tạo nút UP
		jButton_up.addActionListener(ac); // Gắn sự kiện click

		jButton_down = new JButton("DOWN");
		jButton_down.addActionListener(ac);

//		🔥 Hiểu nguyên dòng
//		👉 Dòng này nghĩa là:
//		“Tạo 1 label hiển thị giá trị hiện tại (dạng chữ) và căn giữa”
		jLabel_Value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);
        //Tạo một Label mới( chỗ để hiển thị chữ(UI))
		//this.counterModel.getValue(): lấy giá trị hiện tại từ Model(Ban đầu = 0)
		//+ "" : Ép số thành text(String) 
		/*Ví dụ: 5 + "" → "5" */
		//JLabel.CENTER: Căn giữa chữ trong Label
		
		
		JPanel jPanel = new JPanel(); // Tạo Panel 
		jPanel.setLayout(new BorderLayout()); //Tạo Layout
		jPanel.add(jButton_up, BorderLayout.EAST); // Sắp xếp Trái -> nút UP
		jPanel.add(jLabel_Value, BorderLayout.CENTER); // Trung tâm - số
		jPanel.add(jButton_down, BorderLayout.WEST); // Phải Down

		this.setLayout(new BorderLayout()); 
		this.add(jPanel, BorderLayout.CENTER); // Gắn Panel vào cửa sổ 
	}
//  Khi bấm UP: Model + 1
	// Cập nhập lại Label
	public void increment() {
		this.counterModel.increment();
		this.jLabel_Value.setText(this.counterModel.getValue() + ""); 
	}

//  Khi bấm DOWN: Model - 1
	// Cập nhập lại Label
	public void decrement() {
		this.counterModel.decrement();
		this.jLabel_Value.setText(this.counterModel.getValue() + "");
	}
}
