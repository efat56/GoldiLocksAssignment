package csvFileInputOutputQ2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CsvInputOutput {
	
	

	public static void main(String[] args) {

		String inputFile = "C:\\Users\\fool\\OneDrive\\Desktop\\input.csv";
		String outputFile = "C:\\Users\\fool\\OneDrive\\Desktop\\output.csv";

		try {
			// Open the input file for reading
			BufferedReader bufferReader = new BufferedReader(new FileReader(inputFile));

			// Create an output file for writing
			FileWriter fileWriter = new FileWriter(outputFile);

			// Initialize variables to store the sum and a line of data
			int sum = 0;
			String line;

			// Read and process each line of the input file
			while ((line = bufferReader.readLine()) != null) {

				// Split the line into three parts (assuming three columns)
				String[] num = line.split(",");

				// Initialize variables for numeric values and row sum
				int num1 = Integer.parseInt(num[0]);
				int num2 = Integer.parseInt(num[1]);
				int num3 = Integer.parseInt(num[2]);

				int sumOfNum = num1 + num2 + num3;

				// Add the row sum to the total sum
				sum += sumOfNum;

				// Write the original line with the row sum to the output file
				fileWriter.write(line + "," + sumOfNum + "\n");
			}

			// Close the input and output files
			bufferReader.close();
			fileWriter.close();

			// Display the total sum
			System.out.println("Sum of numeric values is...: " + sum);
			System.out.println("Output written to " + outputFile);
			
		} catch (IOException ioe) {
			System.err.println("An error occurred: " + ioe.getMessage());
			
		} catch (Exception e) {
			System.err.println(e.getMessage());

		}
	}

	}
