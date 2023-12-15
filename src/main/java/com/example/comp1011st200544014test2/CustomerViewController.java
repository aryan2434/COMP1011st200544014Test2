package com.example.comp1011st200544014test2;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

import java.util.List;

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
    public void initialize() {
        List<Business> businessData = Utility.getBusinessData("customers.json");

        if (!businessData.isEmpty()) {
            Business business = businessData.get(0);

            ObservableList<Customers> customerList = FXCollections.observableArrayList(business.getCustomers());


            id.setCellValueFactory(new PropertyValueFactory<>("id"));
            firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
            lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
            city.setCellValueFactory(new PropertyValueFactory<>("city"));

            // Set up cell factory for purchaseColumn to format currency values
            purchase.setCellValueFactory(data -> new SimpleObjectProperty<>(data.getValue().getPurchaseValue()));
            tableView.setItems(customerList);
            numOfCustomer.setText("Number of Customers: "+ tableView.getItems().size());

            purchase.setCellFactory(tc -> new TableCell<Customers, Double>() {
                @Override
                protected void updateItem(Double value, boolean empty) {
                    super.updateItem(value, empty);
                    if (empty || value == null) {
                        setText(null);
                    } else {
                        setText(String.format("$%.2f", value));
                    }
                }
            });

            tableView.refresh();
        }}
    @FXML
    void getAllCustomer(ActionEvent event) {
        initialize();
    }

    @FXML
    void getHigherSavingCustomer(ActionEvent event) {

    }
}
