package com.eltex.data;

public class WallService {
    private Post post = new Post
            .Builder(
            123456,
            1,
            "Sergey",
            "Android development in 2024 is better done in Kotlin using Jetpack Compose",
            "27-09-2024",
            true,
            false
    ).build();

    public void setId(final int id) {
        post = post.builder()
                .setId(id)
                .build();
    }

    public void setAuthorId(final int authorId) {
        post = post.builder()
                .setAuthorId(authorId)
                .build();
    }

    public void setAuthor(final String author) {
        post = post.builder()
                .setAuthor(author)
                .build();
    }

    public void setAuthorJob(final String authorJob) {
        post = post.builder()
                .setAuthorJob(authorJob)
                .build();
    }

    public void setAuthorAvatar(final String authorAvatar) {
        post = post.builder()
                .setAuthorAvatar(authorAvatar)
                .build();
    }

    public void setContent(final String content) {
        post = post.builder()
                .setContent(content)
                .build();
    }

    public void setPublished(final String published) {
        post = post.builder()
                .setPublished(published)
                .build();
    }

    public void setCoordinates(final double latCoord, final double longCoord) {
        post = post.builder()
                .setCoordinates(new Coordinates(latCoord, longCoord))
                .build();
    }

    public void setLink(final String link) {
        post = post.builder()
                .setLink(link)
                .build();
    }

    public void setMentionedMe(final boolean mentionedMe) {
        post = post.builder()
                .setMentionedMe(mentionedMe)
                .build();
    }

    public void setLikedByMe(final boolean likedByMe) {
        post = post.builder()
                .setLikedByMe(likedByMe)
                .build();
    }

    public void setAttachment(String url, AttachmentType attachmentType) {
        post = post.builder()
                .setAttachment(new Attachment(url, attachmentType))
                .build();
    }

    public Post getPost() {
        return post;
    }
}