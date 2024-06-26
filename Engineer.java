package Mext2;

public class Engineer extends Employee{ //public bu sınıfın er yerden erişilebilir olduğunu belirtir.
    //'extends' employee, engineer clasını (sııfın) employeee sınıfından miras aldığını belirtir.
    //'employe' sınıfından miras aldığını belirtir. Yani 'engineer' sınıfının tüm özelliklerine ve mototlarına sahip olurlar.

    public Engineer (String name, double salary, int age){ // bu sınıfın örneği oluşturulurken çağrılan metodudur.
        super(name, salary, age); // employee sınıfının yapıcı metodunu çağırır.
        // bu sınıfın yapıcı metodunu çağırır.
    }
    public double getAnnualBonus(){ //Engineerin yıllk bonusunu hesaplayan metottur. Ve bu metotu döndürür.

        return super.salary*.05;
        //Bu metotm employee sınıfından alınan maaş/salary değişkenine erişir.
        // Ne ile erişir? Super anahtar kelimesi ile erişir.
        //Metotun genel işlevi ise maaşın %5'ini hesaplar ve döndürür. Bu engineerin yıllık bonusunu belirler.
    }
}
