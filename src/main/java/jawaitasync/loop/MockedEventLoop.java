package jawaitasync.loop;

public class MockedEventLoop extends NormalEventLoop {
	long currentTime = 0;

	@Override
	public void setTimeout(Runnable r, int time) {
		System.out.print("[" + currentTime + ":" + time + "]");
		enqueue(r);
		currentTime += time;
	}

	@Override
	protected void handleException(Throwable exception) {
		//exception.printStackTrace();
		System.out.print("[" + exception.getClass().getSimpleName() + ":" + exception.getMessage() + "]");
	}
}