package via.doc1.devopsdemo;

public class TaskTest {
    @Test
    public void ctorTest()
    {
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        Task testTask = new Task(taskId, taskName, taskDesc);
        assertTrue(testTask.getId().equals(taskId));
        assertTrue(testTask.getName().equals(taskName));
        assertTrue(testTask.getDescription().equals(taskDesc));
    }
}
