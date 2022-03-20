public class Car {

        private String carType, id, color;

        public Car(String carType, String id, String color) {
            this.carType = carType;
            this.id = id;
            this.color = color;
        }

        public String getCarType() {
            return carType;
        }

        public void setCarType(String carType) {
            this.carType = carType;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }


