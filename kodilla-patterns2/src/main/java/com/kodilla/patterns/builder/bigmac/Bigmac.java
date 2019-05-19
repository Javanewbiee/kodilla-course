package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private String bun;
    private int burger;
    private String souce;
    private List<String> ingredients;

    public static class BigmacBuilder {

        private String bun;
        private int burger;
        private String souce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }
        public BigmacBuilder burger(int burger) {
            this.burger = burger;
            return this;
        }
        public BigmacBuilder souce(String souce) {
            this.souce = souce;
            return this;
        }
        public BigmacBuilder ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build() {
            return new Bigmac(bun,burger,souce,ingredients);
        }

    }

    private Bigmac(String bun, int burger, String souce, List<String> ingredients) {
        this.bun = bun;
        this.burger = burger;
        this.souce = souce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurger() {
        return burger;
    }

    public String getSouce() {
        return souce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burger='" + burger + '\'' +
                ", souce='" + souce + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
