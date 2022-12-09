/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Diagnostics;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class CategoryInventory {
    ArrayList<Category> categoryList = new ArrayList<Category>();

    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<Category> categoryList) {
        this.categoryList = categoryList;
    }
    public void addItem(Category item){
        categoryList.add(item);
    }
    
    public void removeItem(Category item){
        categoryList.remove(item);
    }
  
}
