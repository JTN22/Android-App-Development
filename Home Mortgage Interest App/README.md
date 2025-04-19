# 🏠 Case Project: Home Mortgage Interest App

**📝 Application Title:** Home Mortgage Interest App  
**🎯 Purpose:** This app calculates the **total interest** paid over the life of a home loan, using user inputs for monthly payment, loan term, and loan principal.

**🧠 Algorithms:**  
1. The app begins by showing an image (`mortgage.png`) and the title **"Mortgage Loan Interest"**.  
2. The user inputs their:
   - Monthly mortgage payment  
   - Loan term in years (10, 20, or 30) which is converted to months  
   - Initial loan amount  
   These values are saved using **SharedPreferences**.  
3. On the second screen, the app retrieves those values and calculates total interest using:  
   **Total Interest = (Monthly Payment × Number of Months) − Initial Principal**  
4. An image (`ten.png`, `twenty.png`, or `thirty.png`) is displayed alongside the calculated interest based on the loan duration.

**⚙️ Conditions:**  
- Use the provided images for each loan type  
- Ensure the result is displayed in **currency format**

> 📚 *This project follows instructions from the 3rd edition (2016) of "Android Boot Camp for Developers Using Java." Currency formatting should be updated for modern localization practices if necessary.*
