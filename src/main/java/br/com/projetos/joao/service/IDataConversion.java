package br.com.projetos.joao.service;

public interface IDataConversion {
        <T> T getData(String json, Class<T> classe);
}
