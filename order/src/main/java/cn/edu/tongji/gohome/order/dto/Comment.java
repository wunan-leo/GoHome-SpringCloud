package
        cn.edu.tongji.gohome.order.dto;

import java.sql.Timestamp;

/**
 * TODO
 *
 * @className: Comment
 * @author: loey
 * @date: 2021-11-23 15:59
 **/
public class Comment {
    private long orderId;
    private String commentContent;
    private int commentScore;
    private Timestamp commentTime;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public int getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(int commentScore) {
        this.commentScore = commentScore;
    }

    public Timestamp getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Timestamp commentTime) {
        this.commentTime = commentTime;
    }
}