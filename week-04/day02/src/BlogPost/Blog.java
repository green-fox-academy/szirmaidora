package BlogPost;

import java.util.ArrayList;

public class Blog {
    private ArrayList <BlogPost> myBlogPost = new ArrayList<BlogPost>();

    public void delete (int index) {
        myBlogPost.remove(index);

    }
    public void update (int index, BlogPost whichBlogPost) {
        myBlogPost.set(index,whichBlogPost);

    }
    public void add (BlogPost blogg) {
        myBlogPost.add(blogg);
    }

    @Override
    public String toString() {
        return "Blog{" +
                "myBlogPost=" + myBlogPost +
                '}';
    }
}
