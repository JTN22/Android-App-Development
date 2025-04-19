# ⚖️ Case Project: BMI Calculator App

**📝 Application Title:** Body Mass Index (BMI) Calculator App  
**🎯 Purpose:** This app calculates the user's Body Mass Index (BMI) using the standard U.S. formula, based on inputs for weight and height.

**🧠 Algorithms:**  
1. The app opens with an image (`bmi1.png`) and the title **"BMI Calculator"**.  
2. On the first screen, the user enters their weight in pounds and height in inches, both rounded to the nearest whole number. These values are saved using **SharedPreferences**.  
3. The second screen retrieves the saved values and calculates the BMI using this formula:  
   **BMI = (Weight in pounds × 703) ÷ (Height in inches × Height in inches)**  
4. The result is displayed rounded to the nearest **tenth (0.1)** alongside the image `bmi2.png`.

**⚙️ Conditions:**  
- Both `bmi1.png` and `bmi2.png` images are included in the project  
- The BMI must appear in a readable, one-decimal format

> 📚 *Based on the 3rd edition (2016) of "Android Boot Camp for Developers Using Java" by Corinne Hoisington. You may wish to modernize SharedPreferences handling for newer Android platforms.*
