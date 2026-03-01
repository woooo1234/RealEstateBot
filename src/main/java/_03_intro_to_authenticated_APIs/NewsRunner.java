package _03_intro_to_authenticated_APIs;

import java.util.List;

import _03_intro_to_authenticated_APIs.data_transfer_objects.Example;
import _03_intro_to_authenticated_APIs.data_transfer_objects.Property;

public class NewsRunner {

    public static void main(String[] args) {
        NewsApi newsApi = new NewsApi();
       Example e = newsApi.testRequest();
     System.out.println(e.getSearchInformation().getTotalResults()); 
      List<Property>  properties =  e.getProperties();
      for(Property p : properties) {
    	  System.out.println(p.getAddressRaw() + "\t\t $" + p.getPrice());
      }
      
//        String topic = JOptionPane.showInputDialog("Please enter a topic for a news story");
//        String story = newsApi.findStory(topic);
//        System.out.println(story);
    }

}
