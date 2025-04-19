# 🧼 Case Project: Car Wash App

**📝 Application Title:** Car Wash App  
**🎯 Purpose:** This app simulates car wash package purchases offered by large cities. Users can choose between different wash types and see the total cost.  

**🧠 Algorithms:**  
1. The app requests the type of car wash package the user would like to purchase.  
2. The user selects from the following options:  
   - **Exterior Wash**: $8.99  
   - **Exterior + Interior Vacuum**: $12.99  
   - Discount applies for 12 or more washes:  
     - **Exterior Wash**: $10.99  
     - **Exterior + Interior**: $15.99  
3. When the user taps the **Calculate Package** button, the total price is displayed based on the number of washes selected.

**⚙️ Conditions:**  
- Use a custom launcher icon (`ic_launcher_carwash.png`) and show it in the Action Bar.  
- Display a car wash image (`carwash.png`) using `ImageView`.  
- Only one `RadioButton` option can be selected at a time.  
- A **toast message** should appear when fewer than 12 washes are selected, reminding the user of the discount at 12+.

> 📚 *Note: This case is from the 3rd edition (2016) of "Android Boot Camp for Developers Using Java" by Corinne Hoisington. Prices or packages may differ today, so feel free to modernize the content!*
