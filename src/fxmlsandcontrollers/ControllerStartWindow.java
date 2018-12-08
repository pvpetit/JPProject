package fxmlsandcontrollers;
/**
 * ControllerStartWindow.java
 * 11/30/2018
 * @author Philemon Petit-Frere
 * This controller is connected to the Start Window.fxml
 * The main function of this controller is to set the tableView and the buttons to add products
 * The tableViewProducts displays the name and type of products created in this program
 *
 */

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.Global;
import sample.Product;

public class ControllerStartWindow implements  Initializable {
  /**
   * This class adds functionality to the StartWindow.fxml
   */
  Product productClickedOn; //Clicked product in the tableView
  @FXML
  TableView<Product> tableViewProducts; //table for Products
  @FXML
  TableColumn<Product,String> colName; //Displays name of Product
  @FXML
  TableColumn<Product,String> colType; //Displays either AudioPlyaer or MoviePlayer

  /**
   * This method displays a popup with window with the toString on the product user clicks.
   * @param event is a mouseClick event
   */
  public void handleMoreInfo(ActionEvent event) {


    //Check if a product was clicked on
    if (productClickedOn != null) {
      Alert alert = new Alert(AlertType.INFORMATION);
      alert.setTitle("Information Dialog");
      alert.setHeaderText(null);
      alert.setContentText(productClickedOn.toString()); //print product toSTring

      alert.showAndWait();
    } else {
      Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("Information Dialog");
      alert.setHeaderText(null);
      alert.setContentText("Please click on a product."); //error message

      alert.showAndWait();
    }
  }

  /**
   * This method will open the AddAudioPlayer.fxml window, also also closes current window.
   * @param event is a mouseClick event.
   */
  public void handleAudio(ActionEvent event) {

    Stage stage = (Stage) tableViewProducts.getScene().getWindow(); //get the current window
    stage.close(); //Close current Window

    //Loads FXML Loader
    FXMLLoader loader = new FXMLLoader();

    //Load a Url to the next window
    loader.setLocation(getClass().getResource("AddAudioPlayer.fxml"));
    try {
      loader.load(); //Loads
    } catch (IOException ex) {
      Logger.getLogger(ControllerAddAudioPlayer.class.getName()).log(Level.SEVERE, null, ex);

    }

    Parent p = loader.getRoot();
    stage = new Stage();

    stage.setTitle("Add Audio Player");
    stage.setScene(new Scene(p));
    stage.show(); //Opens new Window
  }

  /**
   * This method handleMovie will open the AddMoviePlayer.fxml window.
   * Also also closes current window.
   * @param event is a mouseClick event.
   *
   */
  public void handleMovie(ActionEvent event) {

    Stage stage = (Stage) tableViewProducts.getScene().getWindow(); //get the current window
    stage.close(); //Close current Window

    //Loads FXML Loader
    FXMLLoader loader = new FXMLLoader();

    //Load a Url to the next window
    loader.setLocation(getClass().getResource("AddMoviePlayer.fxml"));
    try {
      loader.load(); //Loads
    } catch (IOException ex) {
      Logger.getLogger(ControllerAddMP.class.getName()).log(Level.SEVERE, null, ex);

    }

    Parent p = loader.getRoot();
    stage = new Stage();

    stage.setTitle("Add Audio Player");
    stage.setScene(new Scene(p));
    stage.show(); //Opens new Window

  }

  @FXML void handleStats(ActionEvent event) {
    /**
     * This method will open the StatsWindow.fxml window, also also closes current window.
     * @param event is a mouseClick event.
     */
    //Find currentScene of what window it is.
    Stage stage = (Stage) tableViewProducts.getScene().getWindow();
    stage.close(); //Close current Window

    //Loads FXML Loader
    FXMLLoader loader = new FXMLLoader();

    //Load a Url to the HomePage Fxml
    loader.setLocation(getClass().getResource("StatsWindow.fxml"));
    try {

      loader.load(); //Loads
    } catch (IOException ex) {
      Logger.getLogger(ControllerStartWindow.class.getName()).log(Level.SEVERE, null, ex);

    }

    Parent p = loader.getRoot();
    stage = new Stage();

    stage.setTitle("Stats Window");
    stage.setScene(new Scene(p));
    stage.show(); //Opens new Window
  }


  @Override public void initialize(URL location, ResourceBundle resources) {
    /**
     * This method runs first, it populates the Product table, default vales in Main.java
     * The columns receive the data from the productList of Global Class
     */
    ArrayList<Product> productList = Global.productList;
    ObservableList<Product> observableListProductList =
        FXCollections.observableArrayList(productList);
    //set CellFactory for name column
    colName.setCellValueFactory(cellData -> cellData.getValue().getNameSSPProperty());
    colType.setCellValueFactory(cellData -> cellData.getValue().getTypeSPProperty());
    tableViewProducts.setItems(observableListProductList);

    tableViewProducts.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent event) {
        //set the current room clicked on
        productClickedOn = tableViewProducts.getSelectionModel().getSelectedItem();

      }
    });

  }

  @FXML void handleQuit(ActionEvent event) {
    /**
     * @param event is a mouseClick event.
     * Exit Program, closes window
     */
    System.out.println("Goodbye");
    Stage stageExit = (Stage) tableViewProducts.getScene().getWindow();
    stageExit.close();

  }

}
