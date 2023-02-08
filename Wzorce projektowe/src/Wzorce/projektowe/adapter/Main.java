package Wzorce.projektowe.adapter;

import Wzorce.projektowe.adapter.Api.LibraryAPIv2;
import Wzorce.projektowe.adapter.Api.LibraryAPIv2Impl;

public class Main {

    public static void main(String[] args) {
        User user = new User("Paweł", "Sianos", "12345678912");

        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();

        APIAdapter apiAdapter = new APIAdapter(user, libraryAPIv2);

        BookConnector connector = new BookConnector(user, apiAdapter);

        connector.checkAviability("Harry Potter i Zakon Feniksa");

    }
}
