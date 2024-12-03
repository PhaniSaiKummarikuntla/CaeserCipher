# Caesar Cipher Program in Java

This is a simple implementation of the Caesar Cipher encryption and decryption technique in Java. The program allows the user to either provide a custom key or use the default key of 3. It then provides options for encrypting and decrypting text.

## Features
- Custom key input
- Default key of 3
- Encryption and decryption functionality
- Command-line interface for interaction

## How it works
The Caesar Cipher is a substitution cipher where each letter of the plaintext is replaced by a letter with a fixed number of positions down or up the alphabet. For example, with a key of 3, `A` becomes `D`, `B` becomes `E`, and so on.

### Options Available
1. **Custom Key**: Allows you to input a specific key for encryption and decryption.
2. **Basic Key**: Uses a default key of 3 for encryption and decryption.
3. **Encryption**: Encrypts the provided text using the chosen key.
4. **Decryption**: Decrypts the provided text using the chosen key.

## How to Use

### Step 1: Running the Program
To run the program, compile and execute the `CaserCipher.java` class. You will be presented with a menu to choose the following options:

1. **Select Key Type**: 
    - Enter `1` for a **Custom Key** or `2` for a **Basic Key** (key of 3).
    - If you select option `1`, you will be prompted to enter the key value.
    - If you select option `2`, the program uses a key of `3` by default.

2. **Select Operation**:
    - Enter `1` to **Encrypt** a string.
    - Enter `2` to **Decrypt** a string.
    - Enter `3` to **Exit** the program.

### Step 2: Encryption and Decryption
- After selecting either encryption or decryption, you will be asked to input the text (data).
- The program will output the encrypted or decrypted result based on the input.

### Example
Welcome to CaesarCipher!!.. Enter 1 for Custom Key Enter 2 for Basic Key  

        Enter the Key 5  
        Enter 1 Encryption  
        Enter 2 Decryption  
        Enter 3 for Exit 1  
        Enter the Data: Hello World  
        Encrypted Data: Mjqqt Btwqi  


## Code Structure

### `CaserCipher.java`
- **run()**: Main method that handles user interaction, key selection, and operation choice (encryption/decryption).
- **Encrypt()**: Static method that encrypts the input string using the Caesar Cipher with the specified key.
- **Decrypt()**: Static method that decrypts the input string using the Caesar Cipher. It works by encrypting the text with the reverse key (`26 - key`).

### Example Input and Output
#### Encryption:
        Enter the Data: abc  
        Encrypted Data: def  


#### Decryption:
        Enter the Data: def  
        Decrypted Data: abc  


## Requirements
- Java 8 or higher

## How to Compile and Run

1. **Compile**:
   ```bash
   javac CaserCipher.java
