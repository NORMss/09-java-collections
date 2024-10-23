package com.eltex.data;

import org.jetbrains.annotations.Nullable;

public record Post(
        long id,
        long authorId,
        String author,
        String authorJob,
        @Nullable
        String authorAvatar,
        String content,
        String published,
        @Nullable
        Coordinates coordinates,
        @Nullable
        String link,
        boolean mentionedMe,
        boolean likedByMe,
        @Nullable
        Attachment attachment
) {

    public Builder builder() {
        return new Builder(id, authorId, author, content, published, mentionedMe, likedByMe)
                .setId(id)
                .setAuthorId(authorId)
                .setAuthor(author)
                .setAuthorJob(authorJob)
                .setAuthorAvatar(authorAvatar)
                .setContent(content)
                .setPublished(published)
                .setCoordinates(coordinates)
                .setLink(link)
                .setMentionedMe(mentionedMe)
                .setLikedByMe(likedByMe);
    }

    static class Builder {
        private long id;
        private long authorId;
        private String author;
        private String content;
        private String published;
        private Coordinates coordinates;
        private boolean mentionedMe;
        private boolean likedByMe;
        private String authorJob;
        private String authorAvatar;
        private String link;
        private Attachment attachment;

        public Builder(
                final long id,
                final long authorId,
                final String author,
                final String content,
                final String published,
                final boolean mentionedMe,
                final boolean likedByMe
        ) {
            this.id = id;
            this.authorId = authorId;
            this.author = author;
            this.content = content;
            this.published = published;
            this.mentionedMe = mentionedMe;
            this.likedByMe = likedByMe;
        }


        public Builder setId(final long id) {
            this.id = id;
            return this;
        }

        public Builder setAuthorId(final long authorId) {
            this.authorId = authorId;
            return this;
        }

        public Builder setAuthor(final String author) {
            this.author = author;
            return this;
        }

        public Builder setAuthorJob(final String authorJob) {
            this.authorJob = authorJob;
            return this;
        }

        public Builder setAuthorAvatar(final String authorAvatar) {
            this.authorAvatar = authorAvatar;
            return this;
        }

        public Builder setContent(final String content) {
            this.content = content;
            return this;
        }

        public Builder setPublished(final String published) {
            this.published = published;
            return this;
        }

        public Builder setCoordinates(final Coordinates coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        public Builder setLink(final String link) {
            this.link = link;
            return this;
        }

        public Builder setMentionedMe(final boolean mentionedMe) {
            this.mentionedMe = mentionedMe;
            return this;
        }

        public Builder setLikedByMe(final boolean likedByMe) {
            this.likedByMe = likedByMe;
            return this;
        }

        public Builder setAttachment(final Attachment attachment) {
            this.attachment = attachment;
            return this;
        }

        public Post build() {
            return new Post(id,
                    authorId,
                    author,
                    authorJob,
                    authorAvatar,
                    content,
                    published,
                    coordinates,
                    link,
                    mentionedMe,
                    likedByMe,
                    attachment
            );
        }
    }
}
