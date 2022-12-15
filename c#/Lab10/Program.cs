/*
    What if i push this red button
    Name: xxxx xxxx xxxx
    Date: xxx-xxx-xxx
*/

using System;

namespace Lab10{
    class Program{
        static void Main(string[] args){
            try{
                string[] stringArray = new string[0];
                int[] intArray = new int[0];

                Console.WriteLine("Do you want to store string or integer?");
                #pragma warning disable CS8600 // Converting null literal or possible null value to non-nullable type.
                string userChoice1 = Console.ReadLine();
                #pragma warning restore CS8600 // Converting null literal or possible null value to non-nullable type.
                #pragma warning disable CS8602 // Dereference of a possibly null reference.
                string userChoice = userChoice1.ToLower();
                #pragma warning restore CS8602 // Dereference of a possibly null reference.
                if (userChoice!="integer" && userChoice!="string"){
                    throw new Exception("Uknown data type selected");
                }else{
                    Console.WriteLine("How many values do you want to store?");
                    try{
                        /*
                            read the user value input and try to convert it to int to check if its a number
                        */
                        int numValues = Convert.ToInt32(Console.ReadLine());
                        Random csRandom = new Random();

                        /*
                            if the datat type was number
                            initialize an integer array with the length equal to the value specified by the user
                        */

                        if(userChoice=="integer"){
                            int[] userIntArray = new int[numValues];
                            for(int x=0;x < userIntArray.Length;x++){
                                userIntArray[x] = csRandom.Next(34,158);
                            }
                            Console.WriteLine("Which value in the list do you wish to view? 1 - "+numValues);
                            try{
                                int listIndex = Convert.ToInt32(Console.ReadLine());
                                try{
                                    Console.WriteLine(userIntArray[listIndex-1]);
                                }catch(IndexOutOfRangeException indexEx1){
                                   Console.WriteLine(indexEx1.Message);
                                   throw new Exception(indexEx1.Message);
                                }
                            }catch(FormatException fe2){
                                Console.WriteLine(fe2.Message);
                                throw new Exception(fe2.Message);
                            }
                        }

                        /*
                            if the data type was string
                            initialize a string array with the length equal to the value specified by the user
                        */

                        else if(userChoice=="string"){
                            string[] userStringArray = new string[numValues];
                            for(int y=0;y < userStringArray.Length;y++){
                                userStringArray[y] = Convert.ToString(Convert.ToChar(csRandom.Next(65,91)))+Convert.ToString(Convert.ToChar(csRandom.Next(97,123)));
                            }
                            Console.WriteLine("Which value in the list do you wish to view? 1 - "+numValues);

                            try{
                                int listIndex = Convert.ToInt32(Console.ReadLine());
                                try{
                                    Console.WriteLine(userStringArray[listIndex-1]);
                                }catch(IndexOutOfRangeException indexEx2){
                                   Console.WriteLine(indexEx2.Message);
                                   throw new Exception(indexEx2.Message);
                                }
                            }catch(FormatException fe3){
                                Console.WriteLine(fe3.Message);
                                throw new Exception(fe3.Message);
                            }
                        }
                    }catch(FormatException fe1){
                        Console.WriteLine("The input is not a number");
                        throw new Exception(fe1.Message);
                    }
                }
            }catch(Exception e){
                Console.WriteLine(e.Message);
                Console.WriteLine("Instructions not followed.Shutting down....");
            }finally{
                Console.WriteLine("*Mic Drop*");
            }
        }
    }
}
