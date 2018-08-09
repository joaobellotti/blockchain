package com.example.blockchain.chain.block;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProofOfWorkTest {

    @Test
    public void shouldFindAValidProof() {
        ProofOfWork proofOfWork = new ProofOfWork(new SymmetricSignature());
        int result = proofOfWork.process(100);
        System.out.println("testing pipeline1");
        assertEquals(35293, result);
    }

}