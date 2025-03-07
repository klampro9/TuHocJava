#35. Bài tập Lab 05
Mục tiêu:
- Sử dụng ArrayList
Bài 1:
Nhập danh sách số thực với số lượng tùy ý từ bàn phím. Xuất ra danh sách vừa
nhập và tính tổng của nó
Gợi ý: sử dụng ArrayList<double> để lưu trữ
//nhập số lượng tùy thích
While(true){
Double x = scanner.nextDouble();
list.add(x);
sysout("Nhập thêm (Y/N))?
if(scanner.nextLine().equals("N"){ // why using equals ?
break;
}
}
//tính tổng = vòng lặp for