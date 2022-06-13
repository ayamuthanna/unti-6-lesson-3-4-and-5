import java.util.*;

class Main {
  public static void main(String[] args) {
    


Scanner scan = new Scanner(System.in);

    int [] nums = new int[6];
    nums[0]=5;
    nums[1]=10;
    nums[2]=15;
    nums[3]=20;
    nums[4]=25;
    nums[5]=30;

    for(int i=0; i<nums.length; i++)
    {
      System.out.println("nums[" + i + "]=" + (nums[i]));
    }
    
 for(int i=(nums.length-1); i>=0; i--)
    {
      System.out.println("nums[" + i + "]=" + (nums[i]));
    }

  // use array elements in a calculation

 int sum =nums[0]+ nums[1];
 System.out.println("sum= " +sum);

 nums[5] = nums[5]*2;
 System.out.println("nums[5]= " + nums[5]);

for(int i=0; i<nums.length; i++)
    {
      nums[i]= nums[i]/5;

      System.out.println("nums[" + i + "]=" + (nums[i]));
    }

int[] nums2= {5,10,15,20,25,30};

for(int i=0; i<nums2.length; i++)
    {
      nums2[i]= nums2[i]+100;

      System.out.println("nums2[" + i + "]=" + (nums2[i]));
    }

int sume = 0;
for ( int x : nums)
{
  sume+=x;
}

System.out.println("The average of num is \n%.2%n",+ (double)(sume/nums.length) );

/*z

int sume = 0;
for ( int x : nums)
{
  sume+=x;
}

System.out.println("The average of num is " + (double)(sume/nums.length) );
String[] candy = new String[5];

int index = 0;

while (index < candy.length)
{
  System.out.println("Enter a candy name");
  candy[index] = scan.nextLine();

  System.out.println("candy[" + index + "]=" + (candy[index]));

 index++;
}
*/

// lesson 2 searhcing

// travesre/ iterate, go through array in order

// Lesson 2: Searching

int look = 25 ; 
int indexWhere = -1 ; 

for(int i = 0 ; i < nums.length ; i ++)
{
  if(nums[i] == look)
{
  indexWhere = i ; 
  break ; 
}
}

if(indexWhere != -1)
{
  System.out.println("Look has been found at " + indexWhere);
}
  
  else
{
  System.out.println("Look has not been found.");
}

// Searching for a String

String [] words = {"Have", "a" , "nice" , "day"};

int indexWhere2  = -1 ; 

for(int i = 0 ; i < words.length ; i ++)
{
  if(words[i].equals("nice"))
{
  indexWhere2 = i ; 
  break ; 
}
}

if(indexWhere2 != -1)
{
  System.out.println("Word has been found at " + indexWhere2);
}
  
  else
{
  System.out.println("Word has not been found.");
}

// counting values in array

int evens = 0; 
int odds = 0; 

for(int i = 0 ; i < nums.length ; i ++)
{
  if(nums[i]%2 == 0)
{
  evens ++; 
}

else
{
  odds++ ; 
}
}

System.out.println("Evens = " + evens + " Odds = " + odds);

// set flag if word has more than 4 letters

boolean flag = false ; 

for(int i = 0 ; i < words.length ; i ++)
{
  if(words[i].length() >= 4)
{
  flag = true ; 
  break ; 
}
}

System.out.println("Were there any words with four letters or more? " + flag);

String words2[] = {"apple", "banana", "peach", "cherries", "bluebereies"};


// for each

for (String fruit: words2)
{
  System.out.println(fruit);
}
// for each, print only fruits with length 5

for (String fruit: words2)
{
  if (fruit.length() == 5)
  {
    System.out.println(fruit);
  }
}

for (int i = 0; i< words2.length; i++)
{
  String first =words2[i].substring(0,1);
  String last = words2[i].substring((words2.length-2), (words2.length-1));

  System.out.println("Index Value " + i + " : " + words2[i] + " " + first + " " + last);
}

   }
}