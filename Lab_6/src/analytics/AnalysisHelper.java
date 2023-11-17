/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

/**
 *
 * @author harshalneelkamal
 */

import data.DataStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import model.Comment;
import model.Post;
import model.User;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("Average number of likes per comments: " + likeNumber / commentNumber);
            
    }
    
    public void getMaxLikeCommentsPost() {
        DataStore data = DataStore.getInstance();
        
        Comment commentWithMaxLikes = null;
        
        for(Comment c: data.getComments().values()) {
            //If commentWithMaxLikes is still null, then assign the first comment as comment with max likes
            if(commentWithMaxLikes == null) {
                commentWithMaxLikes = c;
            }
            
            // if current comment has more likes than that commentWithMaxLikes then update the value
            if(c.getLikes() > commentWithMaxLikes.getLikes()) {
                commentWithMaxLikes = c;
            }
        }
        
        int postId = commentWithMaxLikes.getPostId();
        
        System.out.println("Question 2 - Post with Most likes per comment " + data.getPosts().get(postId).getPostId());
    }
    
    public void getPostWithMostComments() {
        DataStore data = DataStore.getInstance();
        
        Post postWithMostComments = null;
        
        for(Post P: data.getPosts().values()) {
            if(postWithMostComments == null) {
                postWithMostComments = P;
            }
            
            if(P.getComments().size() > postWithMostComments.getComments().size()) {
                postWithMostComments = P;
            }
        }
        
         System.out.println("Question 3 - Post with Most comments " + postWithMostComments.getPostId());
    }
    
    public void getPassiveUsers() {
        DataStore data = DataStore.getInstance();
        
        HashMap<Integer, Integer> postNumbers = new HashMap<Integer, Integer>();
        
        for(Post P: data.getPosts().values()) {
            
            int userId = P.getUserId();
            
            if(postNumbers.containsKey(userId)) {
                postNumbers.put(userId, postNumbers.get(userId) + 1);
            } else {
                postNumbers.put(userId, 1);
            }
            
        }
        
        ArrayList<User> users = new ArrayList(data.getUsers().values());
        
        Collections.sort(users, new UserMapComparator(postNumbers));
        
         System.out.println("Question 4 - The following users have least posts: ");
         
         for(int i = 0; i < 5; i++) {
             System.out.println(users.get(i) + " , - Post Count: " + postNumbers.get(users.get(i).getId()));
         }
    }
    
    public void getPassiveCommentUsers() {
         DataStore data = DataStore.getInstance();
         
          HashMap<Integer, Integer> commentNumbers = new HashMap<Integer, Integer>();
          
          for(Comment C: data.getComments().values()) {
                int userId = C.getUserId();
              
                if(commentNumbers.containsKey(userId)) {
                    commentNumbers.put(userId, commentNumbers.get(userId) + 1);
                } else {
                    commentNumbers.put(userId, 1);
                }
            }
          
        ArrayList<User> users = new ArrayList(data.getUsers().values());
        
        Collections.sort(users, new UserMapComparator(commentNumbers));
        
        System.out.println("Question 5 - The following users have least comments: ");
         
        for(int i = 0; i < 5; i++) {
             System.out.println(users.get(i) + " , - Post Count: " + commentNumbers.get(users.get(i).getId()));
        }
    }
    
    public void getPassiveAndActiveOverAllUsers() {
        DataStore data = DataStore.getInstance();
        HashMap<Integer, Integer> overallNumbers = new HashMap<Integer, Integer>();
        
        for(Comment C: data.getComments().values()) {
            int userId = C.getUserId();
              
            if(overallNumbers.containsKey(userId)) {
                overallNumbers.put(userId, overallNumbers.get(userId) + 1 + C.getLikes());
            } else {
                overallNumbers.put(userId, 1 + C.getLikes());
            }
        }
        
        for(Post P: data.getPosts().values()) {
            int userId = P.getUserId();
              
            if(overallNumbers.containsKey(userId)) {
                overallNumbers.put(userId, overallNumbers.get(userId) + 1);
            } else {
                overallNumbers.put(userId, 1);
            }
        }
        
        ArrayList<User> users = new ArrayList(data.getUsers().values());
        
        Collections.sort(users, new UserMapComparator(overallNumbers));
        
        System.out.println("Question 6 - The following users have overall been passive: ");
        
        for(int i = 0; i < 5; i++) {
             System.out.println(users.get(i) + " , - overall Count: " + overallNumbers.get(users.get(i).getId()));
        }
        
        System.out.println("Question 7 - The following users have overall been active: ");
        
        for(int i = users.size() - 1; i > users.size() - 6; i--) {
             System.out.println(users.get(i) + " , - overall Count: " + overallNumbers.get(users.get(i).getId()));
        }
    }
    
}
