package me.kimihiqq.springbootblog.domain.blog.repository;

import me.kimihiqq.springbootblog.domain.article.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}


