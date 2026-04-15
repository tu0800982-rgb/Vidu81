package model;
//Trong mô hình MVC thì model = phần xử lý dữ liệu

public class CounterModel {
private int value; // private = chỉ dùng ở bên trong class
public CounterModel() { //Đây là construcor (hàm khởi tạo)
	this.value = 0;
}
public int getValue() { //Get: xem số
	return value;
}
public void setValue(int value) { //Set: chỉnh số
	this.value = value;
}
public void increment() { //tăng giá trị lên 1
	this.value++;
}
public void decrement() { //giảm giá trị đi 1
	this.value--;
}
public void reset() { //Đặt lại về 0
	this.value = 0;
}
}
// Viết đúng thứ tự Model => View => Controller => test
// CounterModel: Lưu và xử lý dữ liệu
// CounterView: Hiển thị giao diện
// CounterListener: Xử lý khi bấm nút
// Test: Chạy chương trình

//🔥 Tổng kết MVC (cực quan trọng):User bấm → Controller → View → Model → View update
