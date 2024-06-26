package Mext2;

public class Employee { //public bu sınıfın her yerden erişilebilir olduğunu belirtir
    // Çalışanın adını tutan bir değişkendir
   private String name; //'private' bu değişkenin sadece bu sınıfın içinden erişilebilir olduğunu belitir.
    //Çalışanın maaşını tutan ondalıklı sayı değişkeni
   protected double salary; //bu değişkene aynı paket içerisinden veya alt sınıflardan erişilebilir.
    //çalışanın yaşını tutan tam sayı değişkeni
   private int age; //private bu değişkenin sadece bu sınıfın içinden erişilebilir olduğunu belirtir
   public Employee(String name, double salary, int age){ //Bu sınıfın bir örneği oluşturulurken çağrılan metottur.
       this.name=name; //'name' parametresini sınıfın 'name' değişkenine atar.
       this.salary=salary; //'salary' parametresini sınıfın 'salary' değişkenine atar.
       this.age=age; //'age' parametresini sınıfın 'age' değişkenine atar.
   }

   //Getter ve Setter metotları:
    //Bu metotlar, özel değişkenlerin değerlerini dış dünyaya(başka sınıfa) vermek için kullanılır.
   public String getName(){
       return this.name;
   }
   public int getAge(){
       return this.age;
   }
   public double getSalary() {
       return  this.salary;
   }
   public void raiseSalary(){ // maaş arttırmak için kullanılan kod
       this.salary=this.salary*1.2;
   }
}
