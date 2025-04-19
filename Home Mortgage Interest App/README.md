# 🏠💰 Case Project: Home Mortgage Interest App

**📝 Application Title:** Home Mortgage Interest App  
**🎯 Purpose:** This app calculates the total interest paid over the life of a home mortgage loan based on user inputs for monthly payment, loan term, and principal.

**🧠 Algorithms:**  
1. The app’s first screen displays an image (`mortgage.png`) and the title **Mortgage Loan Interest**.  
2. The user enters:
   - Monthly mortgage payment  
   - Loan term (10, 20, or 30 years, converted to months)  
   - Initial loan principal  
   These values are saved using **SharedPreferences**.  
3. On the second screen, retrieve the saved values and compute the total interest using the formula:
4. Display the result along with an image (`ten.png`, `twenty.png`, or `thirty.png`) that matches the selected loan term.

**⚙️ Conditions:**  
- Use the four provided images  
- Ensure the total interest is formatted as **currency**

> 📚 *Note: This project is from the 3rd edition (2016) of "Android Boot Camp for Developers Using Java" by Corinne Hoisington. Consider using updated Android APIs for currency formatting and persistent storage.*
