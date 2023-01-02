# design-pattern
Hand-ons design pattern <br>
Head first design pattern
# Design pattern principle
1. Identify the aspects of your application that vary and separate them from what stays the same. <br>
<Nhận dạng các thành phần hay thay đổi trong ứng dụng và tách biệt chúng ra khỏi phần chung của ứng dụng>
2. Program to an interface, not an implementation. <br>
<Lập trình interface, không phải là một implementation (bản thực thi) - polymorphism>
3. Favor composition over inheritance. <br>
<Ưu tiên composition (kết tập) hơn là inheritance (kế thừa)>
4. Strive for loosely coupled designs between objects that interact. <br>
<Cố gắng thiết kế sự tương tác của các objects là loosely coupled>
5. Classes should be open for extension, but closed for modification. <br>
<Các classes nên được open để mở rộng (extend), đóng lại (closed) để chỉnh sửa>
6. Depend upon abstractions. Do not depend upon concrete classes <br>
<Phụ thuộc vào abstraction, không phụ thuộc vào các class rời rạc>
7. Talk only to your immediate friends
<Chỉ kết nối với các class cần thiết>

#Note
1. Open for extension but closed for modification. <br>

2. Guidelines for Dependency Inversion Principle: <br>
    * No variable should hold a reference to a concrete class <br>
    <If using **new**, it is holding a reference to a concrete class. Use a factory to get around that. <br>
    * No class should derive from a concrete class <br>
    <If deriving from a concrete class, it is depending on a concrete class. Derive from an abstraction, like an interface or an abstract class.
    * *No method should override an implemented method of any of its base classes* <br>
    <Sometime, it is impossible>
