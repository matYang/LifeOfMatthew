package lifeOfMatthew;
public class GirlFriend implements Girl{
	public static final String breakUpLine = "我们分手吧";
	private int counter;
	public GirlFriend(){
		this.counter = 0;
	}
	public void interact(String myWords) {
		if (myWords.equals(breakUpLine)){
			counter++;
		}
		if (counter == 5){
			System.out.println("终于等到了");
		}
	}
	public static void main(String... args) throws YouWillNeverHaveAGirlFriendInTheFirstPlaceException {
		GirlFriend emma = new GirlFriend();
		emma.interact("我们分手吧");
		emma.interact("我们分手吧");
		emma.interact("我们分手吧");
		emma.interact("我们分手吧");
		emma.interact("我们分手吧");
	}
}

