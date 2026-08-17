package com.meemprestaai.dtos;

public class EmprestimoRequest {
	private Long pessoaId;
	private String equipamentoId;
	
	public EmprestimoRequest() {
    }

    public Long getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(Long pessoaId) {
        this.pessoaId = pessoaId;
    }

    public String getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(String equipamentoId) {
        this.equipamentoId = equipamentoId;
    }
}
