package °´Ã¼ÀÇÇ¥Çö;


public class Student {
	
	
	private int _scoreKorean;
	private int _scoreEnglish;
	private int _scoreComputer;

	 private char score2Grade(int score) {
		 if (score>=90) {
			 return  'A';
		 }
		 else if (score<90&&score>=80) {
			 return  'B';
		 }
		 else if (score<80&&score>=70) {
			 return 'C';
		 }
		 else if (score<70&&score>=60) {
			 return 'D';
		 }
		 else {
			 return 'F';
		 }
	 }

	 public double grade2Point(char grade) {
		 
			if(grade == 'A') {
				return 4.0;
				}
			else if(grade =='B') {
				return 3.0;
			}
			else if(grade =='C') {
				return 2.0;
			}
			else if(grade == 'D') {
				return 1.0;
			}
			else {
				return 0.0;
			}
	 }
			
	 
	public Student() {
		
		 this._scoreKorean=0;
		 this._scoreEnglish=0;
		 this._scoreComputer=0;
		 
	 }
	
	 public void setScoreKorean(int aScoreKorean) {
		 this._scoreKorean = aScoreKorean ;
	 }
	 public int scoreKorean() {
		 return this._scoreKorean;
	 } 
	 
	 public char gradekorean() {
		 return this.score2Grade(this._scoreKorean);
	 }
	 public double pointKorean() {
		 return this.grade2Point(this.gradekorean());
	 }
	 
	 
	public void setScoreEnglish(int aScoreEnglish) {
		 this._scoreEnglish = aScoreEnglish ;
	 }
	 public int scoreEnglish() {
		 return this._scoreEnglish; 
	 }  
	 public char gradeEnglish() {
		 return this.score2Grade(this._scoreEnglish);
	 }
	 public double pointEnglish() {
		 return this.grade2Point(this.gradeEnglish());
	 }
	 
	 public void setScoreComputer(int aScoreComputer) {
		 this._scoreComputer = aScoreComputer ;
	 }
	 public int scoreComputer() {
		 return this._scoreComputer;
	 } 
	 public char gradeComputer() {
		 return this.score2Grade(this._scoreComputer);
	 }
	 public double pointComputer() {
		 return this.grade2Point(this.gradeComputer());
	 }
	 

	
		public double gpa() {
			
			double pointKorean;
			double pointEnglish;
			double pointComputer;
			
			pointKorean = this.grade2Point(gradekorean());
			pointEnglish =this.grade2Point(gradeEnglish());
			pointComputer = this.grade2Point(gradeComputer());
			return (pointKorean + pointEnglish + pointComputer) / 3.0;
	}
		
		
		
	 
		}
	 


