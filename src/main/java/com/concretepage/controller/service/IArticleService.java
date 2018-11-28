package com.concretepage.controller.service;

import com.concretepage.controller.entity.Article;

import java.util.List;
public interface IArticleService {
    List<Article> getAllArticles();
    Article getArticleById(int articleId);
    boolean createArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);
} 