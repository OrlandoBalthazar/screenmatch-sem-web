package br.com.alura.screenmatrch.service;

public interface iConverteDados
{
    <T> T obterDados(String json, Class<T> classe);
}
