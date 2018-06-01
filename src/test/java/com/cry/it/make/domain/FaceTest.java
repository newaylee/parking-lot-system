package com.cry.it.make.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public class FaceTest {

    @Test
    public void should_smile() throws Exception {
        assertThat(new Face().face(), is("smile"));
    }

    @Test
    public void test_mock() throws Exception {
        Face testFace = mock(Face.class);
        assertThat(new Face().face(), is("smile"));

    }




}