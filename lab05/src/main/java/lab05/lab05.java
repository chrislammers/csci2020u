package lab05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class lab05 extends Application{
  public static void main(String[] args) {
    System.out.println("TEST! main");

    launch(args);
  }


  @Override
  public void start(Stage stage) throws Exception {
    TableView tableView = new TableView();

    TableColumn<StudentRecord, String> column1 = new TableColumn<>("SID");
    column1.setCellValueFactory(new PropertyValueFactory<>("studentID"));

    TableColumn<StudentRecord, String> column2 = new TableColumn<>("Assignments");
    column2.setCellValueFactory(new PropertyValueFactory<>("assignments"));

    TableColumn<StudentRecord, String> column3 = new TableColumn<>("Midterm");
    column3.setCellValueFactory(new PropertyValueFactory<>("midterm"));

    TableColumn<StudentRecord, String> column4 = new TableColumn<>("Final Exam");
    column4.setCellValueFactory(new PropertyValueFactory<>("finalExam"));

    TableColumn<StudentRecord, String> column5 = new TableColumn<>("Final Mark");
    column5.setCellValueFactory(new PropertyValueFactory<>("finalMark"));

    TableColumn<StudentRecord, String> column6 = new TableColumn<>("Letter Grade");
    column6.setCellValueFactory(new PropertyValueFactory<>("letterGrade"));

    tableView.getColumns().addAll(column1, column2, column3, column4, column5, column6);

    tableView.setItems(DataSource.getAllMarks());

    VBox vbox = new VBox(tableView);

    Scene scene = new Scene(vbox, 555,270);

    stage.setScene(scene);

    System.out.println("TEST!");
    stage.show();

  }
}
