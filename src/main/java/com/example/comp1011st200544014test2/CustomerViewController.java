package com.example.comp1011st200544014test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class CustomerViewController {

    @FXML
    private TableColumn<Customers, String> city;

    @FXML
    private Label customerLabel;
//done
    @FXML
    private TableColumn<Customers, String> firstName;

    @FXML
    private TableColumn<Customers, Integer> id;

    @FXML
    private TableColumn<Customers, String> lastName;

    @FXML
    private Label mainLabel;

    @FXML
    private Label numOfCustomer;

    @FXML
    private ImageView productImage;

    @FXML
    private ListView<String> productListView;

    @FXML
    private TableColumn<Customers, Double> purchase;

    @FXML
    private Label regularPrice;

    @FXML
    private Label salePrice;

    @FXML
    private Label saving;

    @FXML
    private TableView<Customers> tableView;

    @FXML
    void getAllCustomer(ActionEvent event) {

    }

    @FXML
    void getHigherSavingCustomer(ActionEvent event) {

    }

}
