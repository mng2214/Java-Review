package lombok;
//@Getter(onMethod = @SomeAnnotation)
//@Setter(onParam = @SomeAnnotatnions)
//@Setter (value = AccessLevel.PROTECTED) // protected setters. | onMethod = @SomeAnnotatnion  put annotation on top
//NOTE in multiple => ({@Annotation1 , @Annotation2})


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@NoArgsConstructor(access = AccessLevel.PRIVATE)
//@ToString(of = {"make","topSpeed","year"}) // one by one to print
//@ToString(exclude = {"make","owner"}) // one by one to exclude
//@ToString(onlyExplicitlyIncluded = true) // in case we use line 14 or 16
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor // for finals
@EqualsAndHashCode

@Data //getter setter tostring requiredargscons equalsandhahcode
@Builder(builderMethodName = "carBuilder") // custom name for builder

public class Car {

    private String make = "bmw";
    private int topSpeed = 300;
    private int year = 2009;

//    @Singular
//   private List<Integer> listOfCars;


//    @Builder.Default
//    private String make = "bmw";
//    @Builder.Default
//    private int topSpeed = 300;
//    @Builder.Default
//    private int year = 2009;
//    @Singular
//    private List<Integer> listOfCars;


//    public static class CarBuilder {
//
//        private String make;
//        private int topSpeed;
//        private int year;
//
//        public CarBuilder() {
//
//        }
//
//        public CarBuilder make(String make) {
//            this.make = make;
//            return this;
//        }
//
//        public CarBuilder topSpeed(int topSpeed) {
//            this.topSpeed = topSpeed;
//            return this;
//        }
//
//        public CarBuilder year(int year) {
//            this.year = year;
//            return this;
//        }
//
//        public Car build() {
//
//            Car car = new Car(null, 0, 0);
//
//            if (this.make != null) {
//                car.setMake(this.make);
//            }
//
//            if (this.topSpeed != 0) {
//                car.setTopSpeed(this.topSpeed);
//            }
//
//            if (this.year != 0) {
//                car.setYear(this.year);
//            }
//
//            return car;
//
//        }
//
//        public String toString() {
//            return "CarBuilder(" +
//                    "make=" + this.make +
//                    ", topSpeed=" + this.topSpeed +
//                    ", year=" + this.year +
//                    ")";
//        }
//
//    }




//    @Data
//    @ToString
//    public static class Person {
//        private String name;
//        Car car;
//    }
//    @SomeAnnotatnion
//    protected String getMake (){
//        return this.make;
//    }

    //    @SomeAnnotatnion
//    protected void setMake (@SomeAnnotation String make){
//        this.make = make;;
//    }




}
