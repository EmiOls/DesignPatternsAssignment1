public class Main {
  public static void main(String[] args) {
    ListUtils.PopulateListAndSaveToStorage();
    var persons = Storage.fetchPersons();
    System.out.println(persons);
  }
}
