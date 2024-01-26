package com.example.githubactionssandboxpub;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GithubActionsSandboxPubApplicationTests {

	@Test
	void テストケース１() {
		assertThat("aaa").isEqualTo("aaa");
	}

}
