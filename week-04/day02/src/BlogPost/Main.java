package BlogPost;

public class Main {
    public static void main(String[] args) {
        BlogPost loremIpsum = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        BlogPost wbw = new BlogPost("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        BlogPost oneEngineer = new BlogPost("William Turton", "ne Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2017.03.28.");

        Blog myBlogg = new Blog();
        myBlogg.add(loremIpsum);
        myBlogg.add(wbw);
        myBlogg.add(oneEngineer);
        myBlogg.delete(0);
        System.out.println(myBlogg.toString());


    }
}