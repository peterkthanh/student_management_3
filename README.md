# student_management_3

6. [Đẩy commit với lệnh git push](#commit)
7. [Git push discussion](#discussion)

 ## <a name="git"></a> Git là gì ?
 
 **Git** là một hệ thống quản lý phiên bản phân tán (**Distributed Version Control System – DVCS**), nó là một trong những hệ thống quản lý phiên bản phân tán phổ biến nhất hiện nay.
 **Git** cung cấp cho mỗi lập trình viên kho lưu trữ (**repository**) riêng chứa toàn bộ lịch sử thay đổi.
 DVCS nghĩa là hệ thống giúp mỗi máy tính có thể lưu trữ nhiều phiên bản khác nhau của một mã nguồn được nhân bản (**clone**) từ một kho chứa mã nguồn (**repository**), 
 mỗi thay đổi vào mã nguồn trên máy tính sẽ có thể ủy thác (**commit**) rồi đưa lên máy chủ nơi đặt kho chứa chính. à một máy tính khác (nếu họ có quyền truy cập) cũng có thể clone lại mã nguồn từ kho chứa hoặc clone lại một tập hợp các thay đổi mới nhất trên máy tính kia. trong Git thư mục làm việc trên máy tính gọi là Working Tree. Đại loại là như vậy.

 ![Distributed Version Control System](/images/dvcs.png)

 - Ngoài ra, có một cách hiểu khác về Git đơn giản hơn đó là nó sẽ giúp bạn lưu lại các phiên bản của những lần thay đổi vào mã nguồn và có thể dễ dàng khôi phục lại dễ dàng mà không cần copy lại mã nguồn rồi cất vào đâu đó. Họ cũng có thể đối chiếu các thay đổi của bạn rồi gộp phiên bản của bạn vào phiên bản của họ. Cuối cùng là tất cả Cuối cùng là tất cả có thể đưa các thay đổi vào mã nguồn của mình lên một kho chứa mã nguồn.



