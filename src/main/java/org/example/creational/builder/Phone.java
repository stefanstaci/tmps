package org.example.creational.builder;

class Phone {
    private final String name;
    private final String color;
    private final String price;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }

    private Phone(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.price = builder.price;
    }

    static class Builder {
        private final String name;
        private String color;
        private String price;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setPrice(String price) {
            this.price = price;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}
